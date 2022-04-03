package study.java.reactive.programing.reactor;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import reactor.core.publisher.ConnectableFlux;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

/**
 * Âü°í URL https://www.baeldung.com/reactor-core
 * @author Choi Sang Il
 *
 */
public class ReactorTest {
	
	@Test
	@DisplayName("reactor basic")
	public void reactorTest() {
		List<Integer> elements = new ArrayList<>();

		Flux.just(1, 2, 3, 4)
		  .log()
		  .subscribe(elements::add);

		System.out.println(elements);
	}
	
	@Test
	@DisplayName("Backpressure")
	public void reactorTest2() {
		List<Integer> elements = new ArrayList<>();

		Flux.just(1, 2, 3, 4)
		  .log()
		  .subscribe(new Subscriber<Integer>() {
		    private Subscription s;
		    int onNextAmount;

		    @Override
		    public void onSubscribe(Subscription s) {
		        this.s = s;
		        s.request(2);
		    }

		    @Override
		    public void onNext(Integer integer) {
		        elements.add(integer);
		        onNextAmount++;
		        if (onNextAmount % 2 == 0) {
		            s.request(2);
		        }
		    }

		    @Override
		    public void onError(Throwable t) {}

		    @Override
		    public void onComplete() {}
		});		
	}
	
	@Test
	@DisplayName("Mapping Data in a Stream")
	public void reactorTest3() {
		List<Integer> elements = new ArrayList<>();

		Flux.just(1, 2, 3, 4)
		  .log()
		  .map(i -> i * 2)
		  .subscribe(elements::add);
		
		System.out.println(elements);
	}
	
	@Test
	@DisplayName("Combining Two Streams")
	public void reactorTest4() {
		List<String> elements = new ArrayList<>();

		Flux.just(1, 2, 3, 4)
		  .log()
		  .map(i -> i * 2)
		  .zipWith(Flux.range(0, Integer.MAX_VALUE), 
		    (one, two) -> String.format("First Flux: %d, Second Flux: %d", one, two))
		  .subscribe(elements::add);
		
		System.out.println(elements);
	}
	
	@Test
	@DisplayName("Hot Streams")
	public void reactorTest5() {
		ConnectableFlux<Object> publish = Flux.create(fluxSink -> {
		    while(true) {
		        fluxSink.next(System.currentTimeMillis());
		    }
		})
		  .publish();
		
		publish.subscribe(System.out::println);
		publish.connect();
	}
	
	@Test
	@DisplayName("Hot Streams")
	public void reactorTest6() {
		List<Integer> elements = new ArrayList<>();
		Flux.just(1, 2, 3, 4)
		  .log()
		  .map(i -> i * 2)
		  .subscribeOn(Schedulers.parallel())
		  .subscribe(elements::add);
	}
}
