import React from 'react';
import { COLORS } from './Colors';

/**
 * RoadLane Component
 * Hiển thị một làn đường đơn giản với mũi tên, gạch bên và gạch ngang
 * @param {string} direction - Hướng của lane: 'up', 'down', 'left', 'right'
 * @param {number} width - Chiều rộng của lane (pixels)
 * @param {number} height - Chiều cao/chiều dài của lane (pixels)
 */
export const RoadLane = ({
    direction = 'down',
    width = 80,
    height = 300,
}) => {
    const isVertical = direction === 'up' || direction === 'down';

    const getArrowPath = () => {
        if (direction === 'down') {
            return `M 40,20 L 50,50 L 45,50 L 45,80 L 35,80 L 35,50 L 30,50 Z`;
        } else if (direction === 'up') {
            return `M 40,80 L 50,50 L 45,50 L 45,20 L 35,20 L 35,50 L 30,50 Z`;
        } else if (direction === 'right') {
            return `M 20,40 L 50,30 L 50,35 L 80,35 L 80,45 L 50,45 L 50,50 Z`;
        } else if (direction === 'left') {
            return `M 80,40 L 50,30 L 50,35 L 20,35 L 20,45 L 50,45 L 50,50 Z`;
        }
    };

    return (
        <div
            style={{
                position: 'relative',
                width: isVertical ? `${width}px` : `${height}px`,
                height: isVertical ? `${height}px` : `${width}px`,
                backgroundColor: COLORS.LANE_GRAY,
                border: `3px solid ${COLORS.WHITE}`,
                display: 'flex',
                alignItems: 'center',
                justifyContent: 'center',
                overflow: 'visible',
            }}
        >
            {/* Gạch ngang (lane divider) */}
            <div
                style={{
                    position: 'absolute',
                    [isVertical ? 'left' : 'top']: '50%',
                    [isVertical ? 'transform' : '']: isVertical ? 'translateX(-1px)' : '',
                    width: isVertical ? '2px' : '100%',
                    height: isVertical ? '100%' : '2px',
                    backgroundColor: COLORS.WHITE,
                    borderTop: isVertical ? 'none' : `2px dashed ${COLORS.WHITE}`,
                    borderLeft: isVertical ? `2px dashed ${COLORS.WHITE}` : 'none',
                }}
            />

            {/* Mũi tên (arrow) */}
            <svg
                width={isVertical ? width - 20 : height - 20}
                height={isVertical ? height * 0.4 : width - 20}
                viewBox="0 0 80 100"
                style={{
                    position: 'relative',
                    zIndex: 2,
                }}
            >
                <path d={getArrowPath()} fill={COLORS.WHITE} />
            </svg>
        </div>
    );
};
