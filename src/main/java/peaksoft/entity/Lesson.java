package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "lessons")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "lesson_gen")
    @SequenceGenerator(name = "lesson_gen",sequenceName = "lesson_seq",allocationSize = 1)
    private Long id;
    private String title;
    private String description;
    private LocalDate publishedDate;
    private String videoLink;
    private boolean isPresentation;


    // Courses
    @ManyToOne
    private Course courses;

    //  Task
    @OneToOne()
    private Task tasks;






}
