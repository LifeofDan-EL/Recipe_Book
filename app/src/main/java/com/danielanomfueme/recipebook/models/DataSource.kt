package com.danielanomfueme.recipebook.models

import com.danielanomfueme.recipebook.models.Interaction

class DataSource {
     companion object{

         fun  createDataSet(): ArrayList<Interaction>{
             val list = ArrayList<Interaction>()
             list.add(
                 Interaction(
                    "Daniel Anomfueme sent you a message",
                    "Yesterday",
                     "https://avatars0.githubusercontent.com/u/17446480?s=400&u=95456223423719702a46351dc8ba422d992de600&v=4",
                     "Daniel Anomfueme",
                     "I love you",
                     "100k Friends"
                 )
             )

             list.add(
                 Interaction(
                     "20 people added your recipe as favourite",
                     "Wednesday 18 March",
                     "https://avatars0.githubusercontent.com/u/17446480?s=400&u=95456223423719702a46351dc8ba422d992de600&v=4",
                     "Luke Skywalker",
                     "Peace be unto you",
                     "20k Friends"
                 )
             )

             list.add(
                 Interaction(
                     "Captain Spock sent you a message",
                     "Monday 5 April",
                     "https://avatars0.githubusercontent.com/u/17446480?s=400&u=95456223423719702a46351dc8ba422d992de600&v=4",
                     "Captain Spock",
                     "May the force be with you",
                     "100 Friends"
                 )
             )


             list.add(
                 Interaction(
                     "Oladele Tamilore replied your message",
                     "Monday 15 March",
                     "https://avatars0.githubusercontent.com/u/17446480?s=400&u=95456223423719702a46351dc8ba422d992de600&v=4",
                 "James Cameroon",
                     "Here he is",
                     "250k Freinds"
                 )
             )

             list.add(
                 Interaction(
                     "Daniel Anomfueme sent you a message",
                     "Yesterday",
                     "https://avatars0.githubusercontent.com/u/17446480?s=400&u=95456223423719702a46351dc8ba422d992de600&v=4",
                     "Daniel Anomfueme",
                     "I love you",
                     "350k Friends"
                 )
             )

             list.add(
                 Interaction(
                     "20 people added your recipe as favourite",
                     "Wednesday 18 March",
                     "https://avatars0.githubusercontent.com/u/17446480?s=400&u=95456223423719702a46351dc8ba422d992de600&v=4",
                    "Luke Skywalker",
                     "Peace be unto you",
                     "400 Friends"
                 )
             )

             list.add(
                 Interaction(
                     "Oladele Tamilore replied your message",
                     "Monday 15 March",
                     "https://avatars0.githubusercontent.com/u/17446480?s=400&u=95456223423719702a46351dc8ba422d992de600&v=4",
                     "James Cameroon",
                     "Here he is",
                     "350 Friends"
                 )
             )



             return list
         }
     }
 }