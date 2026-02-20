data class Token(
    val accessToken: String,
    val refreshToken: String

) {
    companion object {
        fun fromJson(json: Map<String, Any?>): Token {
            return  Token(
                accessToken = json["access_token"] as String,
                refreshToken = json["refresh_token"] as String
            )
        }

    }

    fun toJson(): Map<String, Any> {
        return mapOf(
            "access_token" to accessToken,
            "refresh_token" to refreshToken
        )
    }

    fun copyWith(accessToken: String? = null, refreshToken: String? = null): Token {
        return Token(
            accessToken = accessToken ?: this.accessToken,
            refreshToken = refreshToken ?: this.refreshToken
        )
    }

    override fun toString(): String {
        return "Token(accessToken: $accessToken, refreshToken: $refreshToken)"
    }


}

