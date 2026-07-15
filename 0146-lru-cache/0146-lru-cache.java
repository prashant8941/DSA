class LRUCache {
LinkedHashMap<Integer , Integer > map; 
int sizee ; 

    public LRUCache(int capacity) {
        sizee =  capacity  ;
        map = new LinkedHashMap<>(capacity, 0.75f, true);
        
    }
    
    public int get(int key) {
        if( map.containsKey(key)){
            return map.get(key); 
        }else{
            return -1 ; 
        }
        
    }
    
    public void put(int key, int value) {
        
        map.put( key , value ); 
 
        if( map.size()> sizee){
            int lastKey = -1 ; 
            for(Map.Entry<Integer, Integer>entry: map.entrySet()){
                lastKey = entry.getKey();
                break ; 


            }
            map.remove(lastKey); 
        }
        
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */