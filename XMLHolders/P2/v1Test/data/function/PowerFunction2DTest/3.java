@Test
    public void testHashCode() {
        PowerFunction2D f1 = new PowerFunction2D(1.0, 2.0);
        PowerFunction2D f2 = new PowerFunction2D(1.0, 2.0);
        assertEquals(f1.hashCode(), f2.hashCode());
    }

}