package com.vector.generator;

import java.util.Random;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class IdGenerator implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {

		Random r = new Random( );
		int v1 = r.nextInt(10);

		int v2 = new Random().nextInt(10);
		int v3 = new Random().nextInt(10);
		int v4 = new Random().nextInt(10);

		String str = v1 + "" + v2 + "" + v3 + "" + v4;

		long value = Long.parseLong(str);

		return value;
	}

}
