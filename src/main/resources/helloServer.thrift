namespace java cn.ac.ict.software.thrift

struct User {
        1: string username,
        2: i32 age,
    }

service HelloWorldService {
    
    string sayHello(1:User user)
}
