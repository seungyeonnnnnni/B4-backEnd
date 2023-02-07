package com.example.b4.entity.post.comment;

import com.example.b4.entity.BaseTimeEntity;
import com.example.b4.entity.post.Post;
import com.example.b4.entity.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@SuperBuilder
@NoArgsConstructor
@Entity
public class Likes extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likesId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne @JoinColumn(name = "post_id")
    private Post post;

    private LikesStatus status;

}