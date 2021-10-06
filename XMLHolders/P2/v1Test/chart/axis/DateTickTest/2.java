@Test
    public void testCloning() throws CloneNotSupportedException {
        DateTick t1 = new DateTick(new Date(0L), "Label", TextAnchor.CENTER,
                TextAnchor.CENTER, 10.0);
        DateTick t2 = (DateTick) t1.clone();
        assertTrue(t1 != t2);
        assertTrue(t1.getClass() == t2.getClass());
        assertTrue(t1.equals(t2));
    }

    