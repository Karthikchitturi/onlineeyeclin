package com.cg.service;

import java.util.List;

import com.cg.Exceptions.DoctorIdNotFoundException;
import com.cg.Exceptions.TestIdNotFoundException;
import com.cg.model.Test;

public interface ITestService {
//method for creating a report
public Test addTest(Test test);
//method for updating a report
public Test updateTest(Test test);
//method for deleting a report
public Test removeTest(int testId)throws TestIdNotFoundException;
// method for viewing  report by individual id
public Test viewTest(int testId)throws TestIdNotFoundException;
//viewing all tests
public List<Test> viewAllTests();
public List<Test> viewTestsByDoctor(int doctorId)throws DoctorIdNotFoundException;
}
