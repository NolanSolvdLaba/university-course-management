package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.dao.CourseMapper;
import org.example.model.Course;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Load MyBatis configuration file
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            // Create a new session
            try (SqlSession session = sqlSessionFactory.openSession()) {
                // Get the mapper interface
                CourseMapper courseMapper = session.getMapper(CourseMapper.class);

                // Retrieve all courses
                List<Course> courses = courseMapper.getAll();
                for (Course c : courses) {
                    System.out.println(c);
                }

                // Create a new course
                Course course = new Course("Algebra", 3, 1, 1, 1, 1, "Math class");

                // Insert the course
                courseMapper.create(course);

                // Commit the changes
                session.commit();


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
