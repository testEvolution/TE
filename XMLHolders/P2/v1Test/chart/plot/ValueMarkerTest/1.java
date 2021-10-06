@Test
    public void testCloning() throws CloneNotSupportedException {
        ValueMarker m1 = new ValueMarker(25.0);
        ValueMarker m2 = (ValueMarker) m1.clone();
        assertTrue(m1 != m2);
        assertTrue(m1.getClass() == m2.getClass());
        assertTrue(m1.equals(m2));
    }

   