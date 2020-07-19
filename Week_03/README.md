学习笔记  

第三周，学习了递归、分支和回溯
1.递归：通过函数体进行的循环。
```
public void recur(int level, int param) {
    // terminator
    if (level > MAX_LEVEL) {
        // process result
        return;
    }
    // process current logic
    process(level, param);
    // drill down
    recur(level: level + 1, newParam);
    // restore current status
}

```
2.思维要点：抵制人肉递归；找最近重复性；数学归纳法思维
3.分治：将问题划分成一系列子问题，递归求解每个子问题。
4.回溯：采用试错的思想，尝试分布的方法解决一个问题。通常用最简单的递归方法来实现。

总结
学完本周的课程，更能体会到所有问题都可以归纳成寻找相似子问题，一定要找到规律。
