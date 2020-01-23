package io.axoniq.foodordering.coreapi

class CreateFoodCardCommand


data class SelectProductCommand(
        val foodCartId:UUID,
        val productId:UUID,
        val quantity:Int
)

data class DeselectProductCommand(
        val foodCartId:UUID,
        val productId:UUID,
        val quantity:Int
)


data class ConfirmOrderCommand(
        val foodCartId:UUID
)