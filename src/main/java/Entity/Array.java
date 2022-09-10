package main.java.Entity;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Array {

    public void getIssue(List<Integer> args) {
        int avgElement = args.stream()
                .mapToInt(arg -> arg)
                .sum() % args.size();

        AtomicInteger issueSteps = new AtomicInteger();
        args.forEach(arg -> issueSteps.addAndGet(Math.abs(avgElement - arg)));
        System.out.println(issueSteps.get());
    }

}
