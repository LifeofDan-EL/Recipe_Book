package com.danielanomfueme.recipebook

import com.danielanomfueme.recipebook.models.Interaction

class DataSource {
     companion object{

         fun  createDataSet(): ArrayList<Interaction>{
             val list = ArrayList<Interaction>()
             list.add(
                 Interaction(
                    "Daniel Anomfueme sent you a message",
                    "Yesterday"
                 )
             )

             list.add(
                 Interaction(
                     "Oladele Tamilore replied your message",
                     "Monday 15 March"
                 )
             )

             list.add(
                 Interaction(
                     "20 people added your recipe as favourite",
                     "Wednesday 18 March"
                 )
             )


        return list
         }
     }
 }