// filters assets by issuer, code or both

import stellar.sdk._

import scala.concurrent.ExecutionContext.Implicits.global


TestNetwork.assets(code = Some("ETH")).foreach(_.foreach(println))

TestNetwork.assets(issuer = Some("GAE325UC3T63ROIUFBBRNMWGM7AY2NI5C2YO55IPLRKCF3UECXLXKNNZ")).foreach(_.foreach(println))

TestNetwork.assets(code = Some("ETH"), issuer = Some("GAE325UC3T63ROIUFBBRNMWGM7AY2NI5C2YO55IPLRKCF3UECXLXKNNZ")).foreach(_.foreach(println))
