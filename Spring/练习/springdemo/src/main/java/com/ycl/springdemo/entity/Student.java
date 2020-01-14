package com.ycl.springdemo.entity;




import javax.persistence.*;

import java.util.Date;
@Entity
@Table(name = "student")
public class Student {
    /**@Column属性详解：
    name    定义了被标注字段在数据库表中所对应字段的名称；
    unique    表示该字段是否为唯一标识，默认为false。如果表中有一个字段需要唯一标识，则既可以使用该标记，也可以使用@Table标记中的@UniqueConstraint。
    nullable    表示该字段是否可以为null值，默认为true。
    insertable    表示在使用“INSERT”脚本插入数据时，是否需要插入该字段的值。
    updatable    表示在使用“UPDATE”脚本插入数据时，是否需要更新该字段的值。insertable和updatable属性一般多用于只读的属性，例如主键和外键等。这些字段的值通常是自动生成的。
    columnDefinition（大多数情况，几乎不用）    表示创建表时，该字段创建的SQL语句，一般用于通过Entity生成表定义时使用。（也就是说，如果DB中表已经建好，该属性没有必要使用。）
    table    表示当映射多个表时，指定表的表中的字段。默认值为主表的表名。
    length    表示字段的长度，当字段的类型为varchar时，该属性才有效，默认为255个字符。
    precision和scale    precision属性和scale属性表示精度，当字段类型为double时，precision表示数值的总长度，scale表示小数点所占的位数。


     @Id :不能是Spring包下的,应当是javax.persistence  包下的.


     @GeneratedValue
     springboot中@GeneratedValue作用：
     （1）、@GeneratedValue注解存在的意义主要就是为一个实体生成一个唯一标识的主键、@GeneratedValue提供了主键的生成策略。
     （2）、@GeneratedValue注解有两个属性,分别是strategy和generator,
            generator属性：
            generator属性的值是一个字符串,默认为"",其声明了主键生成器的名称
            (对应于同名的主键生成器@SequenceGenerator和@TableGenerator)。
     strategy属性：提供四种值:
     -AUTO主键由程序控制, 是默认选项 ,不设置就是这个
     -IDENTITY 主键由数据库生成, 采用数据库自增长, Oracle不支持这种方式
     -SEQUENCE 通过数据库的序列产生主键, MYSQL  不支持
     -Table 提供特定的数据库产生主键, 该方式更有利于数据库的移植

     注意：默认SpringBoot的@GeneratedValue 是不需要加参数的,但是如果数据库控制主键自增(auto_increment), 不加参数就会报错

     **/
    @Id
    //@GeneratedValue
    @Column(name = "id",length = 32 , nullable = false)
    private String id;
    private String name;
    private int age;
    private Date birthday;


    public String getId() {
        return id;
    }
    @Id
    @GeneratedValue
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }


}
