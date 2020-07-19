学习笔记  

第四周，学习了深度优先搜索、广度优先搜索、贪心算法和二分查找  
1.深度优先搜索（DFS）：利用递归实现的搜索算法。
```
visited = set()
def dfs(node, visited):
    visited.add(node)
    for next_node in node.children():
        if not next_node in visited:
            dfs(next node, visited)
```  
2.广度优先搜索（BFS）：利用队列实现的搜索算法。  
```
def bfs(graph, start, end):
    queue = []
    queue.append([start])
    visited.add(start)
    while queue:
        node = queue.pop()
        visited.add(node)
        process(node)
        nodes = generate_related_nodes(node)
        queue.push(nodes)
```  
3.贪心算法：是一种在每一步选择中都采取在当前状态下最好或最优（即最有利）的选择，从而希望导致结果是全局最好或最优的算法。 
贪心：当下做局部最优判断
回溯：能够回退
动态规划：最优判断+回退
4.二分查找：目标函数单调性+存在上下边界+能够通过索引访问。
```
left, right = 0, len(array) - 1
while left <= right:
    mid = (left + right) / 2
    if array[mid] == target:
        break
    elif array[mid] < target:
        left = mid + 1
    else:
        right = mid - 1
```  
5.半有序数组
```
    public int getNum(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = len - 1;
        int mid = 0;
        while (mid != left || mid != right) {
            mid = (left + right) / 2;
            if (arr[mid] > arr[left]) {
                if (arr[mid] < arr[mid + 1]) {
                    left = mid + 1;
                } else {
                    mid = mid + 1;
                    break;
                }
            } else if (arr[mid] < arr[left]) {
                if (arr[mid] > arr[mid - 1]) {
                    right = mid - 1;
                } else {
                    break;
                }
            }
        }
        return mid;
    }
```

总结：
本周讲的这些概念又重新温习了一遍，只是到做题的时候还是会想不到应该优选哪种方法，为什么要选这些，下周没有课了，可以多些时间做题背题，期中考试加油。
