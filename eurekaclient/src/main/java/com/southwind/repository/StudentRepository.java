package com.southwind.repository;

import com.southwind.entity.Student;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.Collection;

public interface StudentRepository {

    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
