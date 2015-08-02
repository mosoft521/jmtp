package com.gmail.mosoft521.jmtp.ch02.project010synNotExtends;

public class Test {

    public static void main(String[] args) {
        Sub subRef = new Sub();

        MyThreadA a = new MyThreadA(subRef);
        a.setName("A");
        a.start();

        MyThreadB b = new MyThreadB(subRef);
        b.setName("B");
        b.start();
    }
}
/*
>>子类无synchronized
第一次:
int sub 下一步sleep begin threadName=A time=1438475090963
int sub 下一步sleep begin threadName=B time=1438475090964
int sub 下一步sleep   end threadName=B time=1438475095967
int sub 下一步sleep   end threadName=A time=1438475095967
int main 下一步sleep begin threadName=B time=1438475095967
int main 下一步sleep   end threadName=B time=1438475100967
int main 下一步sleep begin threadName=A time=1438475100967
int main 下一步sleep   end threadName=A time=1438475105967
第二次:
int sub 下一步sleep begin threadName=A time=1438475279173
int sub 下一步sleep begin threadName=B time=1438475279174
int sub 下一步sleep   end threadName=A time=1438475284174
int sub 下一步sleep   end threadName=B time=1438475284174
int main 下一步sleep begin threadName=A time=1438475284174
int main 下一步sleep   end threadName=A time=1438475289175
int main 下一步sleep begin threadName=B time=1438475289175
int main 下一步sleep   end threadName=B time=1438475294175
>>子类有synchronized
第一次:
int sub 下一步sleep begin threadName=B time=1438475136054
int sub 下一步sleep   end threadName=B time=1438475141055
int main 下一步sleep begin threadName=B time=1438475141055
int main 下一步sleep   end threadName=B time=1438475146055
int sub 下一步sleep begin threadName=A time=1438475146055
int sub 下一步sleep   end threadName=A time=1438475151056
int main 下一步sleep begin threadName=A time=1438475151056
int main 下一步sleep   end threadName=A time=1438475156056
第二次:
int sub 下一步sleep begin threadName=A time=1438475221426
int sub 下一步sleep   end threadName=A time=1438475226426
int main 下一步sleep begin threadName=A time=1438475226426
int main 下一步sleep   end threadName=A time=1438475231426
int sub 下一步sleep begin threadName=B time=1438475231426
int sub 下一步sleep   end threadName=B time=1438475236427
int main 下一步sleep begin threadName=B time=1438475236427
int main 下一步sleep   end threadName=B time=1438475241427
 */