package com.example.git.database

import com.example.git.model.Person

object Database {

    fun getAllBilloners(): ArrayList<Person> {

        val person1 = Person(
            "Ilon Musk",
            "IT",
            "263 mlrd",
            "iwoqeuqwewqiodd ssjad asdasd sa dhjsaja jas jd ja djhajs ad ajsd hjs dhj sahd asjhjhasdas d",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Elon_Musk_Royal_Society_%28crop1%29.jpg/300px-Elon_Musk_Royal_Society_%28crop1%29.jpg"
        )

        val person2 = Person(
            "Jef Bezos",
            "IT",
            "190 mlrd",
            "iwoqeuqwewqiodd ssjad asdasd sa dhjsaja jas jd ja djhajs ad ajsd hjs dhj sahd asjhjhasdas d",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Jeff_Bezos_at_Amazon_Spheres_Grand_Opening_in_Seattle_-_2018_%2839074799225%29_%28cropped%29.jpg/300px-Jeff_Bezos_at_Amazon_Spheres_Grand_Opening_in_Seattle_-_2018_%2839074799225%29_%28cropped%29.jpg"
        )

        val person3 = Person(
            "Bernard Arnault",
            "ART",
            "184 mlrd",
            "iwoqeuqwewqiodd ssjad asdasd sa dhjsaja jas jd ja djhajs ad ajsd hjs dhj sahd asjhjhasdas d",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Bernard_Arnault_%283%29_-_2017_%28cropped%29.jpg/330px-Bernard_Arnault_%283%29_-_2017_%28cropped%29.jpg"
        )

        val arrayList = ArrayList<Person>()
        arrayList.add(person1)
        arrayList.add(person2)
        arrayList.add(person3)

        return arrayList
    }


}