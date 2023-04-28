package com.example.toasty

import android.content.Context
import android.widget.Toast
const val test_var = 500
private val vowels1 = arrayOf('a', 'e', 'i', 'o', 'u')
const val test_var1 = 600

class Toaster {
    fun privateToastLong(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    fun privateToastShortTest(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    //}
    class Rectangle(private val length: Double, private val width: Double) {
        private fun getArea(): Double {
            return length * width
        }

        fun getPerimeter(): Double {
            return 2 * (length + width)
        }
        val messgae = "the are is ${getArea()}"
    }

//class StringUtils {
//    companion object {
//        fun reverseString(str: String): String {
//            return str.reversed()
//        }
//
//        fun isPalindrome(str: String): Boolean {
//            return str == str.reversed()
//        }
//    }
//}

    class StringUtils {
        companion object {
            private val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
            fun isPalindrome(str: String): Boolean {
                val lowercaseStr = str.lowercase()
                val reversedStr = lowercaseStr.reversed()
                if (lowercaseStr != reversedStr) {
                    return false
                }
                for (char in lowercaseStr) {
                    if (char !in vowels) {
//                    return false
                        for (char in lowercaseStr) {
                            if (char !in vowels1) {
                                return false
                            }
                        }

                    }
                }
                return true
            }
        }
    }


    class MathUtils {
        companion object {
            private const val max_salary = 100
            fun add(num1: Int, num2: Int): Int {
                val result = num1 + num2
                return result * max_salary
            }

            fun subtract(num1: Int, num2: Int): Int {
                return (num1 - num2) * max_salary
            }

            fun multiply(num1: Int, num2: Int): Int {
                return (num1 * num2) * test_var1
            }

            fun divide(num1: Int, num2: Int): Double {
                return num1.toDouble() / num2.toDouble()
            }
        }
    }
}



//---------------------------------------

//class MyClass {
//    fun getString(): String {
//        return "Hello, World!"
//    }
//}
