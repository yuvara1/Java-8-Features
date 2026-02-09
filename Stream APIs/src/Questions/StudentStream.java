package Questions;

import java.util.List;

public class StudentStream {
    public List<Student> students = List.of(
            new Student(1, "yuvaraj",   "boopal",    20, "Male",    "Computer Science",       2020, 3.5, true,  "yuvarajacb11@gmail.com",  "Chennai"),
            new Student(2, "suresh",    "kumar",     22, "Male",    "Mechanical Engineering", 2019, 3.2, true,  "sathish@gmail.com",       null),
            new Student(3, "Arun",      "Kumar",     20, "Male",    "Computer Science",       2022, 8.5, true,  "arun.kumar@gmail.com",    "Chennai"),
            new Student(4, "Priya",     "Shankar",   21, "Female",  "Information Technology", 2021, 8.9, true,  "priya.shankar@gmail.com", "Coimbatore"),
            new Student(5, "Vijay",     "Rajan",     22, "Male",    "Mechanical",             2020, 7.6, true,  "vijay.rajan@gmail.com",   "Madurai"),
            new Student(6, "Divya",     "Lakshmi",   20, "Female",  "Electronics",            2022, 9.1, true,  "divya.l@gmail.com",       "Trichy"),
            new Student(7, "Suresh",    "Babu",      23, "Male",    "Civil",                  2019, 6.9, false, "suresh.babu@gmail.com",   "Salem"),
            new Student(8, "Kavya",     "Murugan",   21, "Female",  "Computer Science",       2021, 8.2, true,  "kavya.m@gmail.com",       null),
            new Student(9, "Meena",     "Sivakumar", 20, "Female",  "Information Technology", 2022, 9.4, true,  "meena.s@gmail.com",       "Tirunelveli"),
            new Student(10, "Ravi",     "Prakash",   24, "Male",    "Mechanical",             2019, 6.5, false, "ravi.p@gmail.com",        "Thoothukudi"),
            new Student(11, "Anitha",   "Devi",      21, "Female",  "Computer Science",       2021, 8.8, true,  "anitha.d@gmail.com",      "Thanjavur"),
            new Student(12, "Manoj",    "Kannan",    22, "Male",    "Electronics",            2020, 7.3, true,  "manoj.k@gmail.com",       "Karur"),
            new Student(13, "Nithya",   "Balaji",    20, "Female",  "Civil",                  2022, 8.0, true,  "nithya.b@gmail.com",      "Namakkal"),
            new Student(14, "Pradeep",  "Mohan",     23, "Male",    "Electrical",             2019, 6.8, false, "pradeep.m@gmail.com",     "Dindigul"),
            new Student(15, "Sandhya",  "Krishna",   21, "Female",  "Information Technology", 2021, 9.0, true,  "sandhya.k@gmail.com",     "Kanchipuram"),
            new Student(16, "Ashwin",   "Narayanan", 22, "Male",    "Computer Science",       2020, 8.1, true,  "ashwin.n@gmail.com",      null),
            new Student(17, "Karthik",  "Ramesh",    22, "Male",    "Electrical",             2020, 7.8, true,  "karthik.r@gmail.com",     "Vellore"),
            new Student(18, "Yuvaraj",  "Ravi",      21, "Male",   "Information Technology",  2021, 7.9, true,  "yuva.r@gmail.com",        "Chennai"),
            new Student(19, "Suresh",   "Kannan",    24, "Male",   "Mechanical",              2018, 6.2, false, "suresh.k@gmail.com",      "Erode"),
            new Student(20, "Priya",    "Muthu",     20, "Female", "Computer Science",        2022, 9.3, true,  "priya.m@gmail.com",       null),
            new Student(21, "Vijay",    "Kumar",     23, "Male",   "Electrical",              2019, 7.1, false, "vijay.k@gmail.com",       "Salem"),
            new Student(22, "Divya",    "Priyanka",  21, "Female", "Electronics",             2021, 8.6, true,  "divya.p@gmail.com",       "Madurai"),
            new Student(23, "Arun",     "Prasad",    22, "Male",   "Civil",                   2020, 6.9, true,  "arun.p@gmail.com",        "Tiruppur"),
            new Student(24, "Karthik",  "Selvam",    23, "Male",   "Mechanical Engineering",  2019, 7.4, false, "karthik.s@gmail.com",     null),
            new Student(25, "Meena",    "Ravi",      20, "Female", "Computer Science",        2022, 9.6, true,  "meena.r@gmail.com",       "Chennai"),
            new Student(26, "Ashwin",   "Kumar",     21, "Male",   "Information Technology",  2021, 8.0, true,  "ashwin.k@gmail.com",      "Villupuram"),
            new Student(27, "Naveen",   "Raj",       22, "Male",   "Electronics",             2020, 7.2, true,  "naveen.r@gmail.com",      "Cuddalore"),
            new Student(28, "Sandhya",  "Mohan",     23, "Female", "Electrical",              2019, 6.7, false, "sandhya.m@gmail.com",     "Theni"),
            new Student(29, "Pradeep",  "Kumar",     24, "Male",   "Civil",                   2018, 6.1, false, "pradeep.k@gmail.com",     null),
            new Student(30, "Anitha",   "Ramesh",    22, "Female", "Information Technology",  2020, 8.4, true,  "anitha.r@gmail.com",      "Nagapattinam"),
            new Student(31, "Manoj",    "Prakash",   21, "Male",   "Computer Science",        2021, 8.9, true,  "manoj.p@gmail.com",       "Perambalur"),
            new Student(32, "Kavya",    "Ravi",      20, "Female", "Electronics",             2022, 9.2, true,  "kavya.r@gmail.com",       null),
            new Student(33, "Ravi",     "Shankar",   25, "Male",   "Mechanical",              2017, 5.9, false, "ravi.s@gmail.com",        "Krishnagiri"),
            new Student(34, "Nithya",   "Kumar",     21, "Female", "Computer Science",        2021, 8.5, true,  "nithya.k@gmail.com",      "Ariyalur"),
            new Student(35, "Suresh",   "Rajan",     23, "Male",   "Electrical",              2019, 7.0, false, "suresh.r@gmail.com",      "Thiruvallur"),
            new Student(36, "Divya",    "Shree",     20, "Female", "Information Technology",  2022, 9.1, true,  "divya.s@gmail.com",       "Ramanathapuram"),
            new Student(37, "Yuvaraj",  "Mohan",     22, "Male",   "Computer Science",        2020, 8.3, true,  "yuvaraj.m@gmail.com",     null)

    );


}
