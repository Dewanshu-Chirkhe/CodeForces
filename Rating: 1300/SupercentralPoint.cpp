#include<bits/stdc++.h>
using namespace std;

struct Directions {
    bool right = false;
    bool left = false;
    bool up = false;
    bool down = false;
};

int main(){
    int n;
    cin >> n;
    vector<pair<int , int>> cord(n);
    for(int i=0 ; i<n ; i++){
        cin >> cord[i].first >> cord[i].second;
    }
                
    int count = 0;

    for(int i=0 ; i<n ; i++){
        Directions d;
        int x1 = cord[i].first , y1 = cord[i].second;
        for(int j=0 ; j<n ; j++){
            if(i == j) continue;
            int x2 = cord[j].first , y2 = cord[j].second;
            
            if (x2 == x1 && y2 > y1) d.up = true;
            if (x2 == x1 && y2 < y1) d.down = true;
            if (y2 == y1 && x2 > x1) d.right = true;
            if (y2 == y1 && x2 < x1) d.left = true;
        }
        if(d.up && d.down && d.left && d.right) count++;
    }

    cout << count << endl;
    return 0;
}