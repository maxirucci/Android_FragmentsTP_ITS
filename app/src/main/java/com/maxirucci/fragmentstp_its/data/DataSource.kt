package com.maxirucci.fragmentstp_its.data

class DataSource{
    fun getAgenda(): List<DataModel> {
        return listOf(
            DataModel(
                "Isabella",
                "Ayala",
                2994123123,
                "Gral. Manuel Belgrano 4061, Q8300 Neuquén",
                "https://images.unsplash.com/photo-1632333650953-f68e8b3d5f02?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzNDc0MjcyOA&ixlib=rb-1.2.1&q=80&w=1080"
            ),
            DataModel(
                "Daniel",
                "Barrera",
                2994456789,
                "Libertad 1139, Q8300BQK, Neuquén",
                "https://images.unsplash.com/photo-1632264172162-d995161be500?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzNDc0MjA2OQ&ixlib=rb-1.2.1&q=80&w=1080"
            ),
            DataModel(
                "David",
                "Benítez",
                2994789789,
                "Gral. Villegas 418, R8328 Allen, Río Negro",
                "https://images.unsplash.com/photo-1632920665156-c84f643fcb37?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzNDc0Mjc1MA&ixlib=rb-1.2.1&q=80&w=1080"
            ),
            DataModel(
                "Olivia",
                "Campos",
                2994147147,
                "Saavedra 364, Gral. Fernandez Oro, Río Negro",
                "https://images.unsplash.com/photo-1633368367972-33718b3c2df7?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzNDc0Mjc1NQ&ixlib=rb-1.2.1&q=80&w=1080"
            ),
            DataModel(
                "Gabriel",
                "Cepeda",
                2994258258,
                "Fernández Oro, Gral. Fernandez Oro, Río Negro",
                "https://images.unsplash.com/photo-1632936214770-6b640bfaab50?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzNDc0Mjc1Nw&ixlib=rb-1.2.1&q=80&w=1080"
            ),
            DataModel(
                "Sofía",
                "Duarte",
                2994369369,
                "Gral. Roca 623, R8324 Cipolletti, Río Negro",
                "https://images.unsplash.com/photo-1634218550445-8111a5539475?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzNDc0Mjc2MA&ixlib=rb-1.2.1&q=80&w=1080"
            ),
            DataModel(
                "Victoria",
                "Enríquez",
                2994159159,
                "Venezuela 1721, Cipolletti, Río Negro",
                "https://images.unsplash.com/photo-1634099837033-7f0096cd0380?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzNDc0Mjc2OQ&ixlib=rb-1.2.1&q=80&w=1080"
            ),
            DataModel(
                "Samuel",
                "Ferreira",
                2994263263,
                "Av. San Martín 155, Q8316 Plottier, Neuquén",
                "https://images.unsplash.com/photo-1634587461663-af308ecfe48f?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzNDc0Mjc2Ng&ixlib=rb-1.2.1&q=80&w=1080"
            ),
            DataModel(
                "Alexa",
                "Maldonado",
                2994487487,
                "Avenida Argentina 355, R8303 Cinco Saltos, Río Negro",
                "https://images.unsplash.com/photo-1632585312258-52f368909632?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTYzNDc0Mjc3Mg&ixlib=rb-1.2.1&q=80&w=1080"
            ),
        )
    }
}

data class DataModel(
    val nombre: String? = null,
    val apellido: String? = null,
    val numeroTelefono: Long? = null,
    val direccion: String? = null,
    val urlFotoPerfil: String? = null //"https://source.unsplash.com/random"
)