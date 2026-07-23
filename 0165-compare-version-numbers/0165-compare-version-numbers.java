class Solution {
    public int compareVersion(String version1, String version2) {
        String[]a = version1.split("\\."); 
        String[]b = version2.split("\\.");

        int min = Math.max( a.length , b.length); 
        for( int i =   0 ;i < min ; i++){
            int aa = 0 ; 
            int bb = 0 ; 
            if(i < a.length){
                aa = Integer.parseInt(a[i]); 
            }
            if( i < b.length){
                bb =Integer.parseInt(b[i]); 
            }
            if( aa < bb ){
                return -1 ; 
            }else if( aa > bb){
                return 1 ; 
            }
        }
 
 return 0 ; 
    }
}