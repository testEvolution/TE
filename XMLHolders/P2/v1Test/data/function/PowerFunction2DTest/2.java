@Test
    public void testSerialization() {
        PowerFunction2D f1 = new PowerFunction2D(1.0, 2.0);
        PowerFunction2D f2 = (PowerFunction2D) TestUtils.serialised(f1);
        assertEquals(f1, f2);
    }

    