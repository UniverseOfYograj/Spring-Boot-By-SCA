package in.yograj.app;

import in.yograj.beans.AddNum;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseAddNum {
    static void main() {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/yograj/resources/beanconfiguration.xml");
        AddNum a=container.getBean("a1",AddNum.class);

//        System.out.println(a.show());
        a.show();

        AddNum a1=container.getBean("a2",AddNum.class);
        a1.show();

        AddNum a2=container.getBean("a5",AddNum.class);
        a2.show();
    }
}
