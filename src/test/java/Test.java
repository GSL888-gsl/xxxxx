import isoft.db.DbSqlSession;
import org.apache.ibatis.session.SqlSession;

public class Test {
    @org.junit.Test
    public void test2() {
        SqlSession sqlSession = DbSqlSession.getInstance(null).getSqlSession();
//        UserDao userDao=sqlSession.getMapper(UserDao.class);
//        System.out.println(userDao.login("郭盛林","123456"));
//        System.out.println(userDao.getById(1));
//        User user = new User() ;
//        user.setId(1);
//        user.setPassword("123456789");
//        user.setStatus(0);
//        System.out.println(userDao.updateById(user));
//        sqlSession.commit();
//        User user = new User(null,"张飞","123456",null,1,"张三.test") ;
//        System.out.println(userDao.insert(user));
//        sqlSession.commit();
//        System.out.println(userDao.get(1));
//        CommentDao commentDao=sqlSession.getMapper(CommentDao.class);
//        Comment comment = new Comment(null,1,1,"lalalalala",null) ;
//        System.out.println(commentDao.insertcomment(comment));
//        sqlSession.commit();
//        System.out.println(commentDao.getCommentByNewsId(1));
//        System.out.println(commentDao.getCommentByUserId(1));
//        System.out.println(commentDao.deleteOne(1));
//        sqlSession.commit();
//
//        List<Integer> id = new ArrayList<>() ;
//        id.add(2) ; id.add(3) ;
//        System.out.println(commentDao.deleteMore(id));
//        sqlSession.commit();

    }
}
