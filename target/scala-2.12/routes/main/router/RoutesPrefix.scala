
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/NTB/IuK_2/Webtech/iuk_ii_w/conf/routes
// @DATE:Wed Feb 21 14:38:39 CET 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
