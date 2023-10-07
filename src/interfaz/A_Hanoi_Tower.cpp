/**
 *   author:  josuerom
 *   created: 07/10/23 10:55:21
**/
#include <bits/stdc++.h>
using namespace std;

/// 1 >= n <= 10^9 
long long n, ans;

void solve() {
   cin >> n;
   ans = (n % 2 == 0) ? (n * n) / 2 + (n - 1) : (n * n) / 2 + n;
   cout << ans << endl;
}

int main() {
   ios::sync_with_stdio(false);
   cin.tie(nullptr); cout.tie(nullptr);
   int tt = 1;
   cin >> tt;
   for (int nc = 1; nc <= tt; nc++) {
#ifdef josuerom
      cout << "-- Case #" << nc << " --\n";
      solve();
#else
      solve();
#endif
   }
   return 0;
}
