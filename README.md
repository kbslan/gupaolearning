# 记录咕泡学院学习代码

## 架构师内功心法

## 经典框架中的常见设计模式

### 1. [工厂设计模式](https://github.com/kbslan/gupaolearning/tree/master/design_pattern/src/main/java/com/gupaoedu/vip/pattren/factory)

#### [工厂模式作业](https://github.com/kbslan/gupaolearning/tree/master/design_pattern/src/main/resources/design_pattern/factory_pattern)

###### 1.1 简单工厂模式
###### 1.2 工厂方法模式
###### 1.3 抽象工厂模式

### 2. [单例模式]()

###### 2.1 饿汉式单例 - 在单例类首次加载时就创建实例（缺点：浪费内存空间）
###### 2.2 懒汉式单例 - 被外部类调用时才创建实例
###### 2.3 注册式单例 - 将每一个实例都缓存到统一的容器中，使用唯一标识获取单例
###### 2.4 ThreadLocal单例 - 保证线程内部的全局唯一且天生线程安全（同一个线程内安全）
###### 2.5 重点总结
* 私有化构造器
* 保证线程安全
* 延迟加载
* 防止序列化和反序列化破坏单例
* 防御反射攻击单例

优点：
* 在内存中只有一个实例，减少了内存开销
* 可以避免对资源的多重占用
* 设置全局访问点，严格控制访问

缺点：
* 没有接口，扩展困难
* 如果要扩展单例对象，只有修改代码，不符合开闭原则

