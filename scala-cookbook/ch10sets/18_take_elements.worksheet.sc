/**
 * 从集合里提取元素列表:
 * drop,dropWhile,head,headOption,init,last,lastOption,slice,tail,take,takeWhile
 */

 val x = (1 to 10).toArray
 //去掉从头到指定的元素序列
 val y = x.drop(3)
 //去掉谓词为true的元素
 val y2 = x.dropWhile(_ < 6)
 //从右边去掉4个元素
 val y3 = x.dropRight(4)
 //提取从头到第N个的元素
 val y4 = x.take(3)
 //返回谓词为true的元素
 val y5 = x.takeWhile(_ < 5)
 //提取集合右边三个元素
 val y6 = x.takeRight(3)
// slice(from,until) 返回从from到until的下表的序列
 val peeps = List("John","Mary","Jane","Fred")
 val p1 = peeps.slice(1,3)

 val nums = (1 to 5).toArray
// 取第一个元素
 val head = nums.head
 // 取第一个元素返回Option类型
 val headOpt = nums.headOption
 //获取除最后一个元素的其他序列和tail相反
 val init = nums.init
 //获取最后一个元素
 val last = nums.last
 //获取最后一个元素返回Option
 val lastOpt = nums.lastOption
 //获取除第一个元素的其他元素
 val tail = nums.tail