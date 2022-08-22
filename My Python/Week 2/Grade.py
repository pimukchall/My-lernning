score = int(input( " คะแนน : "))
if (score >= 80) :
        grade = " A "
elif (score >= 70) :
        grade = " B "
elif (score >= 60) :
        grade = " C "
elif (score >= 50) :
        grade = " D "
elif (score < 50) :
        grade = " F "
print(grade)