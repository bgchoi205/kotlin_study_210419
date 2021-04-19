fun main() {

//    var s: Int = 0;
//
//    println("==프로그램 시작==")
//
//    print("숫자 개수 : ")
//    val numbers = readLine()?.trim()?.toInt() ?: 0
//
//    println("$numbers 개의 숫자를 입력받습니다. ")
//
//    val arr = IntArray(numbers) { 0 }
//
//    for (i in 0 until numbers) {
//        print("${i + 1} 번째 숫자 : ")
//        var number = readLine()?.trim()?.toInt() ?: 0
//        arr[i] = number;
//    }
//    println("입력이 완료되었습니다.")
//    for (i in 0 until numbers) {
//        s += arr[i]
//        println("${i + 1}번째로 입력된 숫자 : ${arr[i]}")
//    }
//
//    println("입력하신 숫자의 총 합은 $s 입니다.")
//    println("입력하신 숫자의 평균은 ${s / numbers}입니다.")
//    print("==프로그램 종료==")

    println("==회원관리 프로그램 시작==")


    print("회원 수 : ")
    val membersNum = readLine()!!.trim().toInt()
    var members = Array<Member?>(membersNum) { null }

    println("$membersNum 명의 회원 정보를 입력합니다.")
    for (i in 0 until membersNum) {

        var memberId = i + 1;
        print("${i + 1}번째 회읜의 이름 : ")
        var memberName = readLine()!!.trim()
        print("${i + 1}번째 회읜의 나이 : ")
        var memberAge = readLine()!!.trim().toInt()
        print("${i + 1}번째 회읜의 성별(M/W) : ")
        var memberGender = readLine()!!.trim()[0]

        val member = Member(memberId, memberName, memberAge, memberGender)

        members[i] = member

    }

    for (member in members){
        println("번호 : ${member?.id} / 나이 : ${member?.age} / 성별 : ${member?.getGenderKor()} / 이름 : ${member?.name}")
    }

//    for(i in members.indices){
//
//        println(members[i])
//    }


}

data class Member(
    var id: Int,
    var name: String,
    var age: Int,
    var gender: Char
) {
    fun getGenderKor() : String {
        if(gender == 'w'){
            return "여자"
        }
        else{
            return "남자"
        }
    }

}