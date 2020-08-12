package isoft.dao;

import isoft.entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentDao {

    int insertcomment(Comment comment);

    List<Comment> getCommentByNewsId(@Param("newsid") Integer newsid );


    List<Comment> getCommentByUserId(@Param("userid") Integer userid );


    int deleteOne(@Param("id") Integer id);


    int deleteMore(List<Integer> id) ;
}
