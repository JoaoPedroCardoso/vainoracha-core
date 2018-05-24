package br.com.vainorachamc.core.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by JoaoPedroCardoso on 11/05/18
 */
@Entity
data class Address(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: String,
                   val publicPlace: String,
                   val number: String,
                   val complement: String?,
                   val city: String,
                   val neighborhood: String,
                   val state: String,
                   val zipCode: String,
                   val coordinate: String?)