package study.java.stream;

import java.util.stream.Stream;

/**
 * 모던 자바 인 액션
 * 7장 병렬 스트림
 */
public class ParallelStream {

    public static void main(String[] args) {
        ParallelStream ps = new ParallelStream();
        ps.sequentialSum(10);
    }

    public long sequentialSum(long n){
        return Stream.iterate(1L, i-> i+1)
                .limit(n)
                .reduce(0L, Long::sum);
    }
}
