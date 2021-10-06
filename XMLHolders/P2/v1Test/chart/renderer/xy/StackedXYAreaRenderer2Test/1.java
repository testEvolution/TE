@Test
    public void testEquals() {
        StackedXYAreaRenderer2 r1 = new StackedXYAreaRenderer2();
        StackedXYAreaRenderer2 r2 = new StackedXYAreaRenderer2();
        assertEquals(r1, r2);
        assertEquals(r2, r1);

        r1.setRoundXCoordinates(!r1.getRoundXCoordinates());
        assertFalse(r1.equals(r2));
        r2.setRoundXCoordinates(r1.getRoundXCoordinates());
        assertTrue(r1.equals(r2));
    }

    