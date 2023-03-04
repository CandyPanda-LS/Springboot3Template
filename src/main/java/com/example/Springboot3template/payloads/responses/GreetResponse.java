package com.example.Springboot3template.payloads.responses;

import java.util.List;
import java.util.Objects;

public record GreetResponse(String greet, List<String> favProgrammingLanguages,Person person){

}

// this is same as

//class GreetResponse{
//    private final String greet;
//
//    public GreetResponse(String greet) {
//        this.greet = greet;
//    }
//
//    public String getGreet() {
//        return greet;
//    }
//
//    @Override
//    public String toString() {
//        return "GreetResponse{" +
//                "greet='" + greet + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        GreetResponse that = (GreetResponse) o;
//        return Objects.equals(greet, that.greet);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(greet);
//    }
//}