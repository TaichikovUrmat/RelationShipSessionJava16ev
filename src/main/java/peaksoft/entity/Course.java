package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name = "courses")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "course_gen")
    @SequenceGenerator(name = "course_gen", sequenceName = "course_gen",
            allocationSize = 1)

    private Long id;
    private String name;
    private int price;
    private LocalDate dateOfStart;

    // TODO  Mentor
    @ManyToMany
    private  List<Mentor> mentors;

    // TODO  Student
    @ManyToMany(mappedBy = "courses")
    private  List<Student> students;

    // TODO lesson
    @OneToMany(mappedBy = "courses")
    private  List<Lesson> lessons;

    public Course(String name, int price, LocalDate dateOfStart) {
        this.name = name;
        this.price = price;
        this.dateOfStart = dateOfStart;
    }
}
