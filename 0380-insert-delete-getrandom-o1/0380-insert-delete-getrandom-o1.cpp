class RandomizedSet {
public:
    vector<int> vec;
    RandomizedSet() {        
    }
    
    bool insert(int val) {
      for(int x = 0 ; x <vec.size(); x++) {
          if( val == vec[x]){
              return false;
          }          
      }
        vec.push_back(val);
        return true;
    }
    
    bool remove(int val) {
         for(int x = 0 ; x < vec.size(); x++) {
          if( val == vec[x]){
              swap(vec.back(), vec[x]);
              vec.pop_back();
              return true;
          }
          
      }
        return false;
    }
    
    int getRandom() {
        return vec[rand()%vec.size()];
    }
};

 /**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet* obj = new RandomizedSet();
 * bool param_1 = obj->insert(val);
 * bool param_2 = obj->remove(val);
 * int param_3 = obj->getRandom();
 */