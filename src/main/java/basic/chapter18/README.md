### 场景
游戏中的某个场景，一角色有生命力、攻击力、防御力等，如果允许玩家感觉与Boss决斗效果不理想可以重来，怎么实现？

### Compare
1. 感觉这种模式就像一个快照，保存一个快照，之后需要恢复的话，设置这个快照中的属性就可以了


### Summarize
1. 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样之后就可以将该对象恢复到原先保存的状态