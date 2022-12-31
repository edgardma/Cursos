package pe.com.dyd.spring.boot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secrete.12345678.*";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEpgIBAAKCAQEAynJ3tHVURSf2K8RJ5HhhV1Z0NJ4i8+BqkpuZ5NKNx0g8KQvc\r\n"
			+ "HPlzOBPUAUwWiFkifUZ1xyE5O4K7CyTjDAUy+CzdMx5590g8ypgYk8LbdOA8bSG8\r\n"
			+ "dKvxP+ggzHjdW8PVn3Ojq92X+xByRNZRFL2lekSoNBqaHbOy7gKKvDu6PGwJi1S9\r\n"
			+ "oATQ/LbKITacElKd3GsWxrWpo9duA5jEQ65A/r1r32LH8YewJQSBd6RWUI1PcRUe\r\n"
			+ "cVjPtX91J2heVcN4AkzotLYgk31oys2Z/oDbNwSc8J9GVHdlDeBKOHmoh5hEJYR9\r\n"
			+ "v5+P9g9KFw5IPzDzuEl54g6BSF2nZKbnU+cJTwIDAQABAoIBAQDE3knAKDTZx4Gh\r\n"
			+ "kBFXZyUp3H3GyV0uEbcxeLVQCt0qxPkT5V+YoY/FIasR0985moxqjMFt8sYINBoW\r\n"
			+ "PTm577hgFKjK1EFBEnNjhEKqNlxZLNI2Qg9U2fwR7Hcwv/xrB2bO15J7SFNKJ/Un\r\n"
			+ "Mc7JP58S5n83pALpDV3cDIbDg8WYiLBvEehp1O5xdQrfILmLkPMkAXPujv3pUalu\r\n"
			+ "syIdqoN4zB0R8A1cchYDzZbObiLvdSrceGwcANYDyga/abKTVZianUa3m31D0A8R\r\n"
			+ "etTYfW4qxhZHfhX4f7HPYW/L6pkaYJlcGO8p7kD1G+mz3NFvfpafpkuaX9KfQLjb\r\n"
			+ "U6u2it/hAoGBAOd1iohdEi2aAjDPDpa1ycldfW2kiLtY6SsnXck+LTflyHrrPiyd\r\n"
			+ "ZI8+XRmj9YC+3E9ggjs5dpx73L0joOExlLF0VqZMclB1P0FFgXAgtiNrrwwe4ijP\r\n"
			+ "6K2G9/vYK0dowKPZRloTNZB4ihCqcVK+hAVdtqeg2CmcDeahPt6p8OuxAoGBAN/p\r\n"
			+ "dUsP64HUuxSx3kSspjTq0cikUqXBK1zspB+LNy0yKx4SNHGyGCcNIRUin3ryIeGl\r\n"
			+ "dmKtIvr1SL8aUPJWejiQnRNB8GD4QgHN06bWnuEJ77SSPQXneoXVdORxB+g3ZhDf\r\n"
			+ "SJkn5DEqaFf7Sm1J8wuYg6Hoqplgf9/zP9Yz9YT/AoGBAJ5K0Jc5r3joXp8qu/tu\r\n"
			+ "D7Za7bDSWYBm6e/NWGKM1zfnOhh2UWsJqQAd0mX6r6eA4AKZKfd+8RNL0ka32wqn\r\n"
			+ "cd16htfsaDGGPeBRvJgGhwnqVyie5mSq66HhMC9YQyDvDu//ZBGuGW/YP/Pt3NqN\r\n"
			+ "2JQi5wv1AGBUjV0w4WI+LrnBAoGBAKPfXLSe5iGS64ht1No18T5xTS+m88XT5kSP\r\n"
			+ "/F4JqUwul1fewvsi+II8HaY2PLniU+GtE0OMqzk4IxGZ1PxHRhP34r2hWKffiY+A\r\n"
			+ "cBJ+qLDScNia3oZfr1AbtP0rrDnLsatPfvZ4N420F8GsbAAoSvSFnnD0s0alVXE1\r\n"
			+ "udavGFVJAoGBALM3vF1X9SkBVGQY8F6w4QIUtSICif3DSArVHNjLwHGQ7AedzBUw\r\n"
			+ "1re7ty2UXzKkgtsLt9gOla6+jARaFdgu0fRlR0OLtkSrKQLzGfxyxudhcvzZnpIS\r\n"
			+ "EAI25ejdzai+jo4x0Z1Pa6ifJ/mINv6xy6pVykOGE9lakcqIUnyATZ7c\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAynJ3tHVURSf2K8RJ5Hhh\r\n"
			+ "V1Z0NJ4i8+BqkpuZ5NKNx0g8KQvcHPlzOBPUAUwWiFkifUZ1xyE5O4K7CyTjDAUy\r\n"
			+ "+CzdMx5590g8ypgYk8LbdOA8bSG8dKvxP+ggzHjdW8PVn3Ojq92X+xByRNZRFL2l\r\n"
			+ "ekSoNBqaHbOy7gKKvDu6PGwJi1S9oATQ/LbKITacElKd3GsWxrWpo9duA5jEQ65A\r\n"
			+ "/r1r32LH8YewJQSBd6RWUI1PcRUecVjPtX91J2heVcN4AkzotLYgk31oys2Z/oDb\r\n"
			+ "NwSc8J9GVHdlDeBKOHmoh5hEJYR9v5+P9g9KFw5IPzDzuEl54g6BSF2nZKbnU+cJ\r\n"
			+ "TwIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
}
