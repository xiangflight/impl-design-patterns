### 场景

### Compare


### Summarize
命令模式：将一个请求封装为一个对象，从而使得可用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及支持可撤销的操作
优点：
1. 较容易地设计一个命令队列
2. 在需要的情况下，可以较容易地将命令记入日志
3. 允许接收请求的一方决定是否要否决请求
4. 容易地实现对请求的撤销与重做
5. 比较容易扩展命令类
6. 将 请求一个操作的对象 和 执行一个操作的对象 分离