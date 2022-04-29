package HashMap;

/**
 * 1. 自平衡二叉树.遵循左小右大的原则存放
 * 2. 遍历二叉树的时候有三种方式:
 *      前序遍历:根左右
 *      中序遍历:左根右
 *      后序遍历:左右根
 *
 *      注意:
 *          前中后说的是根的位置
 *          根在前面是前序,根在中间始中序根在后面是后序
 * 3. TreeSet集合/TreeMap集合采用的是 中序遍历方式
 *      Iterator迭代器采用的是中序遍历方式:
 *      左根右
 * 4. 100 200 50 60 80 120 140 130 135 180 666
 *
 *      80:先和100比 比100小,在左边 再和50比 比50大 在右边 再和60比 比60大 往右子树放
 *                               100
 *               50                                         200
 *           40       60                         120
 *                      80                          140             666
 *                                               130       180
 *                                                   135
 *  中序遍历:   40,50,55,60,80,100,120,130,135,140,180,200,666
 */
public class erchsshu {
}