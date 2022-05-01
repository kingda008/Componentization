gradle clean

gradle assembleDebug

gradle assembleRelease



build生命周期



![image-20220411184605533](Gradle.assets/image-20220411184605533.png)



gradle的三种对象

![image-20220411191630516](Gradle.assets/image-20220411191630516.png)



构建过程中的hook

![image-20220411191850525](Gradle.assets/image-20220411191850525.png)





groovy语法

```groovy
task clean(type: Delete) {
    delete rootProject.buildDir
}
```

task 任务。type: Delete 清空  

 delete rootProject.buildDir 删除此目录



增加新任务

```groovy
task stringText{
    def str1 = 'nihao'
    def str2 = 'tianzhen'

    println(str1+str2)

    println "${str1} --- ${str2}"
}

//构建后结果  
nihaotianzhen
nihao --- tianzhen

```
