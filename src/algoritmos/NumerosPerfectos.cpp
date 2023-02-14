/**
 *  author  josuerom
 *  created 13/02/23 16:15
**/
#include <bits/stdc++.h>
using namespace std;
#define ll unsigned long long
#define bigint uint64_t

template<unsigned int Length>
struct big_uint {
    uint64_t primos[Length];
};

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int n, count = 0, m=0, aux = 0;
    cin >> n;
    //int primos[n];
    
    for (int i = 2; true; i++) {
        for (int j = 1; j <= i; j++) {
            if (i%j==0) count++;
        }
        if (count==2) {
            primos[m++] = i;
            if (aux++ == n) break;
        }
        count = 0;
    }
    for (int k = 0; k < n; k++) cout << primos[k] << " ";
    cout << '\n' << "- - -" <<'\n';
    
    for (int l = 0; l < n; l++) {
        bigint answer = (bigint) pow(2, primos[l]-1) * (pow(2, primos[l])-1);
        cout << answer << '\n';
    }
    return 0;
}
