package com.cdt.utils;

import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.message.AuthException;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

public class JwtUtils {
								//token 效期
	private static final long EXPIRATION_TIME = 1 * 60 * 1000;
								//私鑰
	private static final byte[] SECRET = "1qaz@WSX".getBytes();

	// TODO 產生TOKEN
	public static String generateToken(Map<String, String> userDetails) {
		Map<String, Object> claims = new HashMap<>();
		claims.put("userName", userDetails.get("userName"));
		return Jwts.builder().setClaims(claims).setExpiration(new Date(Instant.now().toEpochMilli() + EXPIRATION_TIME))
				.signWith(SignatureAlgorithm.HS512, SECRET).compact();
	}

	// TODO 驗證TOKEN
	public static void validateToken(String token) throws AuthException {
		try {
			Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token);
		} catch (SignatureException e) {
			throw new AuthException("Invalid JWT signature.");
		} catch (MalformedJwtException e) {
			throw new AuthException("Invalid JWT token.");
		} catch (ExpiredJwtException e) {
			throw new AuthException("Expired JWT token");
		} catch (UnsupportedJwtException e) {
			throw new AuthException("Unsupported JWT token");
		} catch (IllegalArgumentException e) {
			throw new AuthException("JWT token compact of handler are invalid");
		}
	}

	// TODO main方法做測試 右鍵run as -> Java appliaction 就會執行以下
	public static void main(String[] args) throws Exception {

	}
}
