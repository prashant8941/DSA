/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if( root == null )return ""; 
        StringBuilder sb  = new StringBuilder(); 
        Queue<TreeNode>q = new LinkedList<>(); 
        q.offer(root); 
        while( !q.isEmpty()){
            TreeNode rem = q.poll(); 
            if(rem == null){
                sb.append("n "); 
                continue ; 
            }
            sb.append(rem.val +" "); 
            q.offer(rem.left); 
            q.offer(rem.right); 
        
        }
        return sb.toString(); 
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    if( data == "")return null ; 
       Queue<TreeNode>q = new LinkedList<>(); 
       String[]arr= data.split(" "); 
       TreeNode root = new TreeNode(Integer.parseInt(arr[0])); 
       q.offer(root); 
       for( int i = 1  ;  i <  arr.length  ; i++){
        TreeNode chek = q.poll(); 
        if(! arr[i].equals("n")){
            TreeNode tem = new TreeNode(Integer.parseInt(arr[i])); 
            chek.left = tem ; 
            q.offer(tem ); 
        }
        i++; 
        if( ! arr[i].equals("n")){
              TreeNode tem = new TreeNode(Integer.parseInt(arr[i])); 
            chek.right= tem; 
            q.offer(tem ); 
        }
       }
        return root ; 
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));