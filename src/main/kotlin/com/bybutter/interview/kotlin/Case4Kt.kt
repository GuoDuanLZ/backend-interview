package com.bybutter.interview.kotlin

import com.bybutter.interview.Case4
import com.bybutter.interview.Normal

object Case4Kt: Case4 {
    /**
     * 实现一个路由机制，table 是路由表，是由路由记录构成的 map，
     * key 的格式是 192.168.0.0/16，value 是对应的主机名，
     * ip 是需要进行路由的 ip，格式是标准的 ip，例如 192.168.31.1，
     * 需要返回 ip 路由之后对应的主机名，如果找不到匹配的路由记录，返回 null
     */
    @Normal
    override fun routing(table: Map<String, String>, ip: String): String? {
        TODO()
    }
}